package subProj_550

import subProj_550.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_550")
    name = "subProj 550"

    buildType(subProj_bt_550_4)
    buildType(subProj_bt_550_5)
    buildType(subProj_bt_550_0)
    buildType(subProj_bt_550_1)
    buildType(subProj_bt_550_2)
    buildType(subProj_bt_550_3)
})
