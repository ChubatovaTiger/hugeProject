package subProj_1550

import subProj_1550.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1550")
    name = "subProj 1550"

    buildType(subProj_bt_1550_2)
    buildType(subProj_bt_1550_1)
    buildType(subProj_bt_1550_0)
    buildType(subProj_bt_1550_5)
    buildType(subProj_bt_1550_4)
    buildType(subProj_bt_1550_3)
})
