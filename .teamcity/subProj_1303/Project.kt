package subProj_1303

import subProj_1303.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1303")
    name = "subProj 1303"

    buildType(subProj_bt_1303_5)
    buildType(subProj_bt_1303_2)
    buildType(subProj_bt_1303_1)
    buildType(subProj_bt_1303_4)
    buildType(subProj_bt_1303_3)
    buildType(subProj_bt_1303_0)
})
