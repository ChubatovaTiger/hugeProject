package subProj_442

import subProj_442.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_442")
    name = "subProj 442"

    buildType(subProj_bt_442_4)
    buildType(subProj_bt_442_5)
    buildType(subProj_bt_442_2)
    buildType(subProj_bt_442_3)
    buildType(subProj_bt_442_0)
    buildType(subProj_bt_442_1)
})
