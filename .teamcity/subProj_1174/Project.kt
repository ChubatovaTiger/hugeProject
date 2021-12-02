package subProj_1174

import subProj_1174.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1174")
    name = "subProj 1174"

    buildType(subProj_bt_1174_5)
    buildType(subProj_bt_1174_1)
    buildType(subProj_bt_1174_2)
    buildType(subProj_bt_1174_3)
    buildType(subProj_bt_1174_4)
    buildType(subProj_bt_1174_0)
})
