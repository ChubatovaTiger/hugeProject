package subProj_1484

import subProj_1484.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1484")
    name = "subProj 1484"

    buildType(subProj_bt_1484_1)
    buildType(subProj_bt_1484_2)
    buildType(subProj_bt_1484_0)
    buildType(subProj_bt_1484_5)
    buildType(subProj_bt_1484_3)
    buildType(subProj_bt_1484_4)
})
