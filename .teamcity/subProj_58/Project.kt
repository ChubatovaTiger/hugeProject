package subProj_58

import subProj_58.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_58")
    name = "subProj 58"

    buildType(subProj_bt_58_0)
    buildType(subProj_bt_58_2)
    buildType(subProj_bt_58_1)
    buildType(subProj_bt_58_4)
    buildType(subProj_bt_58_3)
    buildType(subProj_bt_58_5)
})
