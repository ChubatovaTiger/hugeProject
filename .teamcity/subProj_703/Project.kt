package subProj_703

import subProj_703.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_703")
    name = "subProj 703"

    buildType(subProj_bt_703_4)
    buildType(subProj_bt_703_5)
    buildType(subProj_bt_703_2)
    buildType(subProj_bt_703_3)
    buildType(subProj_bt_703_0)
    buildType(subProj_bt_703_1)
})
