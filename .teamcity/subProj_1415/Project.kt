package subProj_1415

import subProj_1415.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1415")
    name = "subProj 1415"

    buildType(subProj_bt_1415_5)
    buildType(subProj_bt_1415_4)
    buildType(subProj_bt_1415_3)
    buildType(subProj_bt_1415_2)
    buildType(subProj_bt_1415_1)
    buildType(subProj_bt_1415_0)
})
