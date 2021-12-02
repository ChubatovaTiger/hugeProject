package subProj_536

import subProj_536.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_536")
    name = "subProj 536"

    buildType(subProj_bt_536_5)
    buildType(subProj_bt_536_4)
    buildType(subProj_bt_536_3)
    buildType(subProj_bt_536_2)
    buildType(subProj_bt_536_1)
    buildType(subProj_bt_536_0)
})
