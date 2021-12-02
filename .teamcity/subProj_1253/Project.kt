package subProj_1253

import subProj_1253.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1253")
    name = "subProj 1253"

    buildType(subProj_bt_1253_4)
    buildType(subProj_bt_1253_3)
    buildType(subProj_bt_1253_5)
    buildType(subProj_bt_1253_0)
    buildType(subProj_bt_1253_2)
    buildType(subProj_bt_1253_1)
})
