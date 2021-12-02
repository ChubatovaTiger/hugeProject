package subProj_668

import subProj_668.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_668")
    name = "subProj 668"

    buildType(subProj_bt_668_5)
    buildType(subProj_bt_668_4)
    buildType(subProj_bt_668_3)
    buildType(subProj_bt_668_2)
    buildType(subProj_bt_668_1)
    buildType(subProj_bt_668_0)
})
