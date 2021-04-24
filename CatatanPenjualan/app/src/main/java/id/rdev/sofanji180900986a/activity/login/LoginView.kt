package id.rdev.sofanji180900986a.activity.login

import id.rdev.sofanji180900986a.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}