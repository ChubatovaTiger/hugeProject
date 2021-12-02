package subProj_1447

import subProj_1447.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1447")
    name = "subProj 1447"

    buildType(subProj_bt_1447_5)
    buildType(subProj_bt_1447_4)
    buildType(subProj_bt_1447_1)
    buildType(subProj_bt_1447_0)
    buildType(subProj_bt_1447_3)
    buildType(subProj_bt_1447_2)
})
