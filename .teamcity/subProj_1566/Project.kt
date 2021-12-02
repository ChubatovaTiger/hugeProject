package subProj_1566

import subProj_1566.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1566")
    name = "subProj 1566"

    buildType(subProj_bt_1566_2)
    buildType(subProj_bt_1566_3)
    buildType(subProj_bt_1566_4)
    buildType(subProj_bt_1566_5)
    buildType(subProj_bt_1566_0)
    buildType(subProj_bt_1566_1)
})
