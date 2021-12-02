package subProj_957

import subProj_957.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_957")
    name = "subProj 957"

    buildType(subProj_bt_957_2)
    buildType(subProj_bt_957_1)
    buildType(subProj_bt_957_4)
    buildType(subProj_bt_957_3)
    buildType(subProj_bt_957_5)
    buildType(subProj_bt_957_0)
})
