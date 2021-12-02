package subProj_127

import subProj_127.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_127")
    name = "subProj 127"

    buildType(subProj_bt_127_5)
    buildType(subProj_bt_127_4)
    buildType(subProj_bt_127_3)
    buildType(subProj_bt_127_2)
    buildType(subProj_bt_127_1)
    buildType(subProj_bt_127_0)
})
