package subProj_342

import subProj_342.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_342")
    name = "subProj 342"

    buildType(subProj_bt_342_3)
    buildType(subProj_bt_342_4)
    buildType(subProj_bt_342_5)
    buildType(subProj_bt_342_0)
    buildType(subProj_bt_342_1)
    buildType(subProj_bt_342_2)
})
