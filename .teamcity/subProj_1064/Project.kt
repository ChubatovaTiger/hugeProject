package subProj_1064

import subProj_1064.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1064")
    name = "subProj 1064"

    buildType(subProj_bt_1064_5)
    buildType(subProj_bt_1064_2)
    buildType(subProj_bt_1064_1)
    buildType(subProj_bt_1064_4)
    buildType(subProj_bt_1064_3)
    buildType(subProj_bt_1064_0)
})
