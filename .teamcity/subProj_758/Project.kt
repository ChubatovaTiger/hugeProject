package subProj_758

import subProj_758.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_758")
    name = "subProj 758"

    buildType(subProj_bt_758_2)
    buildType(subProj_bt_758_3)
    buildType(subProj_bt_758_4)
    buildType(subProj_bt_758_5)
    buildType(subProj_bt_758_0)
    buildType(subProj_bt_758_1)
})
