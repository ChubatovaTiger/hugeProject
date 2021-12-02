package subProj_425

import subProj_425.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_425")
    name = "subProj 425"

    buildType(subProj_bt_425_0)
    buildType(subProj_bt_425_2)
    buildType(subProj_bt_425_1)
    buildType(subProj_bt_425_4)
    buildType(subProj_bt_425_3)
    buildType(subProj_bt_425_5)
})
