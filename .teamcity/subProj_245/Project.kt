package subProj_245

import subProj_245.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_245")
    name = "subProj 245"

    buildType(subProj_bt_245_5)
    buildType(subProj_bt_245_3)
    buildType(subProj_bt_245_4)
    buildType(subProj_bt_245_1)
    buildType(subProj_bt_245_2)
    buildType(subProj_bt_245_0)
})
