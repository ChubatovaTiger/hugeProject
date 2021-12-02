package subProj_1056

import subProj_1056.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1056")
    name = "subProj 1056"

    buildType(subProj_bt_1056_3)
    buildType(subProj_bt_1056_2)
    buildType(subProj_bt_1056_5)
    buildType(subProj_bt_1056_4)
    buildType(subProj_bt_1056_1)
    buildType(subProj_bt_1056_0)
})
