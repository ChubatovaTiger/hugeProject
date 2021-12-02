package subProj_921

import subProj_921.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_921")
    name = "subProj 921"

    buildType(subProj_bt_921_3)
    buildType(subProj_bt_921_2)
    buildType(subProj_bt_921_1)
    buildType(subProj_bt_921_0)
    buildType(subProj_bt_921_5)
    buildType(subProj_bt_921_4)
})
