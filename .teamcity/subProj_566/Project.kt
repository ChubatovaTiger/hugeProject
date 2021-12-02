package subProj_566

import subProj_566.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_566")
    name = "subProj 566"

    buildType(subProj_bt_566_0)
    buildType(subProj_bt_566_2)
    buildType(subProj_bt_566_1)
    buildType(subProj_bt_566_4)
    buildType(subProj_bt_566_3)
    buildType(subProj_bt_566_5)
})
