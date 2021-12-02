package subProj_1611

import subProj_1611.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1611")
    name = "subProj 1611"

    buildType(subProj_bt_1611_4)
    buildType(subProj_bt_1611_3)
    buildType(subProj_bt_1611_2)
    buildType(subProj_bt_1611_1)
    buildType(subProj_bt_1611_0)
    buildType(subProj_bt_1611_5)
})
