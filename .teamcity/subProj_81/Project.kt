package subProj_81

import subProj_81.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_81")
    name = "subProj 81"

    buildType(subProj_bt_81_3)
    buildType(subProj_bt_81_4)
    buildType(subProj_bt_81_1)
    buildType(subProj_bt_81_2)
    buildType(subProj_bt_81_5)
    buildType(subProj_bt_81_0)
})
