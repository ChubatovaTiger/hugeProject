package subProj_817

import subProj_817.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_817")
    name = "subProj 817"

    buildType(subProj_bt_817_1)
    buildType(subProj_bt_817_0)
    buildType(subProj_bt_817_3)
    buildType(subProj_bt_817_2)
    buildType(subProj_bt_817_5)
    buildType(subProj_bt_817_4)
})
