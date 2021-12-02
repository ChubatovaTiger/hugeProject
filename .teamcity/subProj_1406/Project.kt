package subProj_1406

import subProj_1406.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1406")
    name = "subProj 1406"

    buildType(subProj_bt_1406_4)
    buildType(subProj_bt_1406_3)
    buildType(subProj_bt_1406_2)
    buildType(subProj_bt_1406_1)
    buildType(subProj_bt_1406_5)
    buildType(subProj_bt_1406_0)
})
