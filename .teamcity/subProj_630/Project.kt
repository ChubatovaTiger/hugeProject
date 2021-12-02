package subProj_630

import subProj_630.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_630")
    name = "subProj 630"

    buildType(subProj_bt_630_0)
    buildType(subProj_bt_630_5)
    buildType(subProj_bt_630_2)
    buildType(subProj_bt_630_1)
    buildType(subProj_bt_630_4)
    buildType(subProj_bt_630_3)
})
