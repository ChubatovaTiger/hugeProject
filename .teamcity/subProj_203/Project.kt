package subProj_203

import subProj_203.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_203")
    name = "subProj 203"

    buildType(subProj_bt_203_3)
    buildType(subProj_bt_203_4)
    buildType(subProj_bt_203_5)
    buildType(subProj_bt_203_0)
    buildType(subProj_bt_203_1)
    buildType(subProj_bt_203_2)
})
