package subProj_1245

import subProj_1245.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1245")
    name = "subProj 1245"

    buildType(subProj_bt_1245_0)
    buildType(subProj_bt_1245_1)
    buildType(subProj_bt_1245_2)
    buildType(subProj_bt_1245_3)
    buildType(subProj_bt_1245_4)
    buildType(subProj_bt_1245_5)
})
