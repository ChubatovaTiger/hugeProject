package subProj_239

import subProj_239.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_239")
    name = "subProj 239"

    buildType(subProj_bt_239_1)
    buildType(subProj_bt_239_0)
    buildType(subProj_bt_239_3)
    buildType(subProj_bt_239_2)
    buildType(subProj_bt_239_5)
    buildType(subProj_bt_239_4)
})
