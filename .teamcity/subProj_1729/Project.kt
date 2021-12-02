package subProj_1729

import subProj_1729.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1729")
    name = "subProj 1729"

    buildType(subProj_bt_1729_5)
    buildType(subProj_bt_1729_3)
    buildType(subProj_bt_1729_4)
    buildType(subProj_bt_1729_1)
    buildType(subProj_bt_1729_2)
    buildType(subProj_bt_1729_0)
})
