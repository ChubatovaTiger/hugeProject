package subProj_686

import subProj_686.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_686")
    name = "subProj 686"

    buildType(subProj_bt_686_0)
    buildType(subProj_bt_686_1)
    buildType(subProj_bt_686_2)
    buildType(subProj_bt_686_3)
    buildType(subProj_bt_686_4)
    buildType(subProj_bt_686_5)
})
