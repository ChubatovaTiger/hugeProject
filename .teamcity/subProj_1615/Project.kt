package subProj_1615

import subProj_1615.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1615")
    name = "subProj 1615"

    buildType(subProj_bt_1615_0)
    buildType(subProj_bt_1615_5)
    buildType(subProj_bt_1615_4)
    buildType(subProj_bt_1615_3)
    buildType(subProj_bt_1615_2)
    buildType(subProj_bt_1615_1)
})
