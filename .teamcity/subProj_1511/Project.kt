package subProj_1511

import subProj_1511.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1511")
    name = "subProj 1511"

    buildType(subProj_bt_1511_1)
    buildType(subProj_bt_1511_0)
    buildType(subProj_bt_1511_3)
    buildType(subProj_bt_1511_2)
    buildType(subProj_bt_1511_5)
    buildType(subProj_bt_1511_4)
})
