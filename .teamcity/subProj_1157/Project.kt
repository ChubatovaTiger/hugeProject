package subProj_1157

import subProj_1157.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1157")
    name = "subProj 1157"

    buildType(subProj_bt_1157_3)
    buildType(subProj_bt_1157_2)
    buildType(subProj_bt_1157_1)
    buildType(subProj_bt_1157_0)
    buildType(subProj_bt_1157_5)
    buildType(subProj_bt_1157_4)
})
