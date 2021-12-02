package subProj_1287

import subProj_1287.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1287")
    name = "subProj 1287"

    buildType(subProj_bt_1287_4)
    buildType(subProj_bt_1287_5)
    buildType(subProj_bt_1287_2)
    buildType(subProj_bt_1287_3)
    buildType(subProj_bt_1287_0)
    buildType(subProj_bt_1287_1)
})
