package subProj_1884

import subProj_1884.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1884")
    name = "subProj 1884"

    buildType(subProj_bt_1884_5)
    buildType(subProj_bt_1884_4)
    buildType(subProj_bt_1884_3)
    buildType(subProj_bt_1884_2)
    buildType(subProj_bt_1884_1)
    buildType(subProj_bt_1884_0)
})
