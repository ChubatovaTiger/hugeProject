package subProj_756

import subProj_756.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_756")
    name = "subProj 756"

    buildType(subProj_bt_756_4)
    buildType(subProj_bt_756_5)
    buildType(subProj_bt_756_0)
    buildType(subProj_bt_756_1)
    buildType(subProj_bt_756_2)
    buildType(subProj_bt_756_3)
})
