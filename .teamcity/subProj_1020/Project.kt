package subProj_1020

import subProj_1020.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1020")
    name = "subProj 1020"

    buildType(subProj_bt_1020_5)
    buildType(subProj_bt_1020_0)
    buildType(subProj_bt_1020_4)
    buildType(subProj_bt_1020_3)
    buildType(subProj_bt_1020_2)
    buildType(subProj_bt_1020_1)
})
