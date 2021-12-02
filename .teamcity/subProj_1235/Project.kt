package subProj_1235

import subProj_1235.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1235")
    name = "subProj 1235"

    buildType(subProj_bt_1235_0)
    buildType(subProj_bt_1235_1)
    buildType(subProj_bt_1235_2)
    buildType(subProj_bt_1235_3)
    buildType(subProj_bt_1235_4)
    buildType(subProj_bt_1235_5)
})
