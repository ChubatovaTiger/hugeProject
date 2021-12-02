package subProj_1212

import subProj_1212.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1212")
    name = "subProj 1212"

    buildType(subProj_bt_1212_5)
    buildType(subProj_bt_1212_4)
    buildType(subProj_bt_1212_3)
    buildType(subProj_bt_1212_2)
    buildType(subProj_bt_1212_1)
    buildType(subProj_bt_1212_0)
})
