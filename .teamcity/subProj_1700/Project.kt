package subProj_1700

import subProj_1700.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1700")
    name = "subProj 1700"

    buildType(subProj_bt_1700_1)
    buildType(subProj_bt_1700_0)
    buildType(subProj_bt_1700_3)
    buildType(subProj_bt_1700_2)
    buildType(subProj_bt_1700_5)
    buildType(subProj_bt_1700_4)
})
