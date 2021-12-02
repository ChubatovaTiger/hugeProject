package subProj_1312

import subProj_1312.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1312")
    name = "subProj 1312"

    buildType(subProj_bt_1312_4)
    buildType(subProj_bt_1312_3)
    buildType(subProj_bt_1312_5)
    buildType(subProj_bt_1312_0)
    buildType(subProj_bt_1312_2)
    buildType(subProj_bt_1312_1)
})
