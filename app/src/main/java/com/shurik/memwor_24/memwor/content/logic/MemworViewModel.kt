package com.shurik.memwor_24.memwor.content.logic

class MemworViewModel {
    companion object{
        var vkPostsLiveData = PostLiveData()
        var vkDomainsLiveData = DomainsLiveData()

        var redditPostsLiveData = PostLiveData()
        var redditDomainsLiveData = DomainsLiveData()

        var telegramDomainsLiveData = DomainsLiveData()
        var telegramPostsLiveData = PostLiveData()
    }
}