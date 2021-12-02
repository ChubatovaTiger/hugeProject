package subProj_132

import subProj_132.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_132")
    name = "subProj 132"

    buildType(subProj_bt_132_5)
    buildType(subProj_bt_132_4)
    buildType(subProj_bt_132_3)
    buildType(subProj_bt_132_2)
    buildType(subProj_bt_132_1)
    buildType(subProj_bt_132_0)
})
