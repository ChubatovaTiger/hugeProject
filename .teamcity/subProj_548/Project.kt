package subProj_548

import subProj_548.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_548")
    name = "subProj 548"

    buildType(subProj_bt_548_0)
    buildType(subProj_bt_548_1)
    buildType(subProj_bt_548_2)
    buildType(subProj_bt_548_3)
    buildType(subProj_bt_548_4)
    buildType(subProj_bt_548_5)
})
