package subProj_603

import subProj_603.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_603")
    name = "subProj 603"

    buildType(subProj_bt_603_3)
    buildType(subProj_bt_603_4)
    buildType(subProj_bt_603_5)
    buildType(subProj_bt_603_0)
    buildType(subProj_bt_603_1)
    buildType(subProj_bt_603_2)
})
