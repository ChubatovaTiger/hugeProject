package subProj_551

import subProj_551.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_551")
    name = "subProj 551"

    buildType(subProj_bt_551_3)
    buildType(subProj_bt_551_4)
    buildType(subProj_bt_551_5)
    buildType(subProj_bt_551_0)
    buildType(subProj_bt_551_1)
    buildType(subProj_bt_551_2)
})
