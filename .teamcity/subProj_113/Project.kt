package subProj_113

import subProj_113.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_113")
    name = "subProj 113"

    buildType(subProj_bt_113_5)
    buildType(subProj_bt_113_3)
    buildType(subProj_bt_113_4)
    buildType(subProj_bt_113_1)
    buildType(subProj_bt_113_2)
    buildType(subProj_bt_113_0)
})
