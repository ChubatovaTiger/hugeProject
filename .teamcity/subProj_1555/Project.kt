package subProj_1555

import subProj_1555.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1555")
    name = "subProj 1555"

    buildType(subProj_bt_1555_1)
    buildType(subProj_bt_1555_0)
    buildType(subProj_bt_1555_5)
    buildType(subProj_bt_1555_4)
    buildType(subProj_bt_1555_3)
    buildType(subProj_bt_1555_2)
})
