package subProj_1230

import subProj_1230.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1230")
    name = "subProj 1230"

    buildType(subProj_bt_1230_4)
    buildType(subProj_bt_1230_5)
    buildType(subProj_bt_1230_0)
    buildType(subProj_bt_1230_1)
    buildType(subProj_bt_1230_2)
    buildType(subProj_bt_1230_3)
})
